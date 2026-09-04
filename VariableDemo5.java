package variable;

public class VariableDemo5 {

    public static void main(String[] args) {
/*
        BMI身体质量指数计算公式：BMI = 体重 ÷ 身高²（体重单位：千克，身高单位：米）
        BMI数值(kg/m²) 身体状态 健康风险
＜18.5 消瘦 部分增加
        18.5–23.9 正常 正常
        24.0–26.9 偏胖 增加
        27.0–29.9 肥胖 中度增加
≥30 严重肥胖 严重增加
              */
        //BMI = 体重 / 身高的平方

        // 1. 定义变量记录我的体重 68.9KG
        double weight = 68.9;

        // 2. 定义变量记录我的身高 1，93
        double height = 1.93;

        // 3. 计算BMI
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

        //扩展：计算当前身高，标准BMI下最多多少千克
        double standardMaxBmi = 23.9;
        double maxWeight = standardMaxBmi * (height * height);
        System.out.println("Max weight: " + maxWeight + "KG");

    }
}
