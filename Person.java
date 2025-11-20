class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    // - рефлексивность: obj.equals(obj) должно возвращать true
    // - симметричность: a.equals(b) и b.equals(a) должны быть одинаковыми
    // - транзитивность: при a.equals(b) и b.equals(c) a.equals(c) должно быть true
    // - равенство с null: a.equals(null) должно возвращать false
}
