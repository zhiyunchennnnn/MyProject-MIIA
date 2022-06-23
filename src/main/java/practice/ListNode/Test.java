package practice.ListNode;

public class Test {
    public static void main(String[] args) {
        ListNode nodeSta = new ListNode(0); //創建首節點
        ListNode nextNode;                     //變量在移動過程中指向當前節點
        nextNode = nodeSta;                    //指向首節點

        for (int i = 1; i <10 ; i++) {
            ListNode node = new ListNode(i);   //生成新節點
            nextNode.next=node;                //把新節點連接起來
            nextNode=nextNode.next;            //當前節點往後移動
        }//當for循環結束後當前節點指向最後一個節點

        nextNode = nodeSta;   //重新賦值讓它指向首節點
        print(nextNode);
    }
    static void print(ListNode listNode){
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
        System.out.println();
    }
}
