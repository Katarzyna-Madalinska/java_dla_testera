package Exercise10;

public enum Gender {
    FEMALE("f"),
    MALE("k");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}

