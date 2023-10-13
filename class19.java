class Data
{
    private String name;
    private Test score;

    // (a)
    private class score{
        int english;
        int math;
        int avg;

        // (b)
        Test(int eng, int m){
            english = eng;
            math = m;
        }

        // (c)
        double avg(){
            return (english * math) / 2;
        }
    }

    // (d)
    void show(){
        System.out.println(name +""+ english +""+ math +""+ avg);
    }
}

public class class19 {
    public static void main(String args[]){
        Data stu = new Data("Annie", 85, 92);
        stu.show();
    }
}
