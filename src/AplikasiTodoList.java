public class AplikasiTodoList {


    //kapasitas string
    public static String []  model = new String[10];


    public static void main(String[] args) {

        testAddTodoList();

    }

    // menampilkan todo list
    public static void showTodoList(){
        for ( var i = 0; i < model.length; i++)
        {
            var todo = model[i];
            var no = i + 1;

            if ( todo != null){
                System.out.println(no +". " + todo);
            }
        }
    }

    public static void testShowTodoList(){
        model [0] = "Belajar Java Dasar";
        model [1] = "Studi Java Dasar : Aplikasi Todolist";
        showTodoList();
    }

    // menambah todo ke list
    public static void addTodoList(String todo){

        //apakah data penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++){
            if (model[i] == null){
                //model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // jika penuh, kita resize ukuran array 2x lipat
        if (isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }

        //tambahkan ke posisi yang data array nya null
        for (var i = 0; i < model.length; i++){
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }

    }

    public  static void testAddTodoList (){
        for ( int i = 0; i < 25; i++){
            addTodoList("COntoh todo ke. " + i);
        }
        showTodoList();
    }


    // mengapus todo list
    public static boolean removeTodoList( Integer number){
        if ( (number - 1) >= model.length){
            return false;
        }else if
        (model[number - 1] == null) {
            return false;
        }else {
            model [number - 1 ] = null;
            return true;
        }

    }



    //menampilkan view  todo list

    public static void viewShowTodoList(){

    }

    //menampilkan view menambah todo list
    public static void viewAddTodoList(){

    }

    //menampilkan view mengapus todo list
    public static void viewRemoveTodoList(){


    }

}
