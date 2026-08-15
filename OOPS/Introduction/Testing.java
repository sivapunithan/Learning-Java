package OOPS.Introduction;

public class Testing {

    interface Button{
        void press();
    }

    static class RemoteControl{
        private Button button;

        public RemoteControl(Button button){
            this.button = button;
        }

        public void userPressesButton(){
            System.out.println("Remote: button physically pressed");
            button.press();
        }

    }

   static class DoorbellButton implements Button{
        public void press(){
            System.out.println("Ding dong !");
        }
    }

    public static void main(String[] args) {
        Button myButton = new DoorbellButton();
        RemoteControl remote = new RemoteControl(myButton);
        remote.userPressesButton();
    }
}
