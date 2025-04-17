public class MyArrayList {
    private int size = 0;
    private String[] employees = new String[10];

    public void add(int index){
        if(size == employees.length){
            String[] newEmployees = new String[size*2];
            for(int i = 0; i < employees.length; i++){
                newEmployees[i] = employees[i];
            }
        }
        employees[size] = employees[index];
        size++;

    }
    public void add(String name){
        if(size == employees.length){
            String[] newEmployees = new String[size*2];
            for(int i = 0; i < employees.length; i++){
                newEmployees[i] = employees[i];
            }
        }
        employees[size] = name;
        size++;
    }

    public void remove(String name) {
        for (int i = 0; i < size; i++) {
            if (employees[i].equals(name)) {
                employees[i] = employees[size - 1];
                size--;
                return;
            }

        }

    }
    public int getSize(){return size;}
    public String getName(int index){return employees[index];}






}
