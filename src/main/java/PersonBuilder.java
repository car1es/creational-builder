public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age >= 0 && age < 120) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Не верный возраст!");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        if (!address.isEmpty()) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Пустой адрес!");
        }
        return this;
    }

    public Person build() {
        if (name == null || name.isEmpty() || surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Нет заполненны обязательные поля (Имя/фамилия)");
        } else if (!age.equals(null)) {
            return new Person(name, surname, age, address);
        } else {
            return new Person(name, surname, address);
        }
    }


}
