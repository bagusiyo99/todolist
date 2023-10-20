public class AplikasiTodoList {


    public static String []  model = new String[10];
    public static void main(String[] args) {

        testShowTodoList();

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
        var penuh = true;
        for (int i = 0; i < model.length; i++){
            if (model[i] == null){
                //model masih ada yang kosong
                penuh = false;
                break;
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

    // mengapus todo list
    public static void removeTodoList(){

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
