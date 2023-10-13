class Namecard
{
    private String name;
    private String address;
    private Phone data;

    // (a)
    private class data{ // there's a private class that means it can be use only by its external class
    // if it been setten get...method that it can visit private member
        
        String company;
        String cell;

        // (b)
        Phone(String s1, String s2){
            company = s1;
            cell = s2;
        }
    }

    // (c)
    public void show(){
        System.out.println(name +""+ address +""+ data); // as a String for this method
    }
}

public class class17 {
    public static void main(String args[]){
        // (d)
        Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");
        first.show();
    }
}
