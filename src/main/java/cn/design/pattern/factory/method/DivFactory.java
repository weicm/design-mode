package cn.design.pattern.factory.method;

/**
 * Created by weicm on 2018/4/3.
 */
public class DivFactory implements Factorry {
    @Override
    public Operation createOpration() {
        return new DivOperation();
    }
}
