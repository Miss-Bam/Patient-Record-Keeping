package personal_projects.patient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientInfo_Test {
    private PatientInfo patient = new PatientInfo("Yonela","Bam", "9811140389082","0679516572", 109.5F,158.4F);

    @Test
    @DisplayName("Confirming personal details")
    void testPatientPersonalDetails(){
        assertEquals("Yonela",patient.getName());
        assertEquals("Bam", patient.getSurname());
        assertEquals("9811140389082",patient.getId_number());
        assertEquals("0679516572",patient.getCellphone());
    }

    @Test
    @DisplayName("Changing cellphone number")
    void testChangeOfCellphone(){
        patient.setCellphone("0658238554");
        assertEquals("0658238554",patient.getCellphone());
    }

}
