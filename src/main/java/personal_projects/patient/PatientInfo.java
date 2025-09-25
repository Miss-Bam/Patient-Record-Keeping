package personal_projects.patient;

public class PatientInfo {
    private String name;
    private String surname;
    private String id_number;
    private String cellphone;
    private float weight;
    private float height;

    public PatientInfo(String name, String surname, String id_number, String cellphone, float weight, float height){
        this.name = name;
        this.surname = surname;
        this.id_number = id_number;
        this.cellphone = cellphone;
        this.weight = weight;
        this.height = height;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
