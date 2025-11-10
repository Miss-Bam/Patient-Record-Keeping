package personal_projects.patient;

public class PatientInfo {
    private String name;
    private String surname;
    private String id_number;
    private String cellphone;
    private String next_of_kin_name;
    private String next_of_kin_cellphone;

    public PatientInfo(String name, String surname, String id_number, String cellphone, float weight, float height){
        this.name = name;
        this.surname = surname;
        this.id_number = id_number;
        this.cellphone = cellphone;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId_number() {
        return id_number;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getNext_of_kin_name() {
        return next_of_kin_name;
    }

    public void setNext_of_kin_name(String next_of_kin_name) {
        this.next_of_kin_name = next_of_kin_name;
    }

    public String getNext_of_kin_cellphone() {
        return next_of_kin_cellphone;
    }

    public void setNext_of_kin_cellphone(String next_of_kin_cellphone) {
        this.next_of_kin_cellphone = next_of_kin_cellphone;
    }
}
