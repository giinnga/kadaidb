package action;

import javax.persistence.EntityManager;

import entity.Person;
import util.DBUtil;

public class Test {

    public static void main(String[] args) {
        // EntityManagerのオブジェクトを生成
        EntityManager em = DBUtil.createEntityManager();

        //1件取得して名前情報を表示する
        Person person = em.find(Person.class, 1);
        System.out.println(person.getName());

        // EntityManagerの利用を終了する
        em.close();
    }

}
