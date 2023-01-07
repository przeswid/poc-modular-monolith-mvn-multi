import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

class ArchitectureTest {

    @Test
    void checkIfBookingModuleIsOnlyAccessedByPortIn() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("poc.modular");

        ArchRule ruleService = classes().that()
                .resideInAPackage("poc.modular.booking..")
                .and()
                .resideOutsideOfPackage("poc.modular.booking.service")
                .should().onlyBeAccessed().byClassesThat()
                .resideInAPackage("poc.modular.booking..");

        ruleService.check(importedClasses);
    }
}
