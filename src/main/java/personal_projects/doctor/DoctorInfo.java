package personal_projects.doctor;

public class DoctorInfo {
    private String name;
    private String surname;
    private String id_number;
    private String cellphone;
    private String hpcsa_reg_number;
    private String practice_number;

    public DoctorInfo(String name, String surname, String id_number, String cellphone, String hpcsa_reg_number, String practice_number){
        this.name = name;
        this.surname = surname;
        this.id_number = id_number;
        this.cellphone = cellphone;
        this.hpcsa_reg_number = hpcsa_reg_number;
        this.practice_number = practice_number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId_number() {
        return id_number;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getHpcsa_reg_number() {
        return hpcsa_reg_number;
    }

    public String getPractice_number() {
        return practice_number;
    }


}
