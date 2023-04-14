package oopComprehensiveExercises1;

import java.util.Random;

/**
 * 需求:
 * 格斗游戏，每个游戏角色的姓名，血量，都不相同，在选定人物的时候（new对象的时候），这些信息就应该被确定下来。
 * 举例：
 * 程序运行之后结果为：
 * 姓名为:乔峰		血量为:100
 * 姓名为:鸠摩智	    血量为:100
 * 乔峰举起拳头打了鸠摩智一下，造成了XX点伤害，鸠摩智还剩下XXX点血。
 * 鸠摩智举起拳头打了鸠摩智一下，造成了XX点伤害，乔峰还剩下XXX点血。
 * 乔峰举起拳头打了鸠摩智一下，造成了XX点伤害，鸠摩智还剩下XXX点血。
 * 鸠摩智举起拳头打了鸠摩智一下，造成了XX点伤害，乔峰还剩下XXX点血。
 * 乔峰K.O.了鸠摩智
 */
public class Role {
    // 属性
    private String name;
    private int bloodVolume;

    // 构造方法
    public Role() {
    }

    public Role(String name, int bloodVolume) {
        this.name = name;
        this.bloodVolume = bloodVolume;
    }

    // get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBloodVolume() {
        return bloodVolume;
    }

    public void setBloodVolume(int bloodVolume) {
        this.bloodVolume = bloodVolume;
    }

    /**
     * 定义一个方法用于攻击别人
     * 思考:谁攻击谁?
     * Role r1 = new Role();
     * Role r2 = new Role();
     * r1.攻击(r2);  // 方法的调用者去攻击参数
     *
     * @param role1
     */
    public void attack(Role role1){
        // 计算造成的伤害 1-20随机
        Random r1 = new Random();
        int hurtBlood = r1.nextInt(20) + 1;

        // 修改一下挨揍的人的血量
        int remainBlood = role1.getBloodVolume() - hurtBlood;  // remainBlood表示挨揍人的剩余血量.
        remainBlood = remainBlood < 0 ? 0 : remainBlood;  // 对remainBlood做验证,如果为负数,就修改为0.
        // 修改挨揍的人的血量
        role1.setBloodVolume(remainBlood);

        // this表示方法的调用者
        System.out.println(this.getName() + "举起拳头,打了" + role1.getName() +
                "一下,造成了" + hurtBlood + "点伤害," + role1.getName() +
                "还剩下了" + remainBlood + "点血量"  );
    }
}
