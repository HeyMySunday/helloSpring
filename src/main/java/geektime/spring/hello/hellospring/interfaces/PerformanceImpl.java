package geektime.spring.hello.hellospring.interfaces;

import org.springframework.stereotype.Component;

@Component("performanceImpl")
public class PerformanceImpl implements  Performance {
    @Override
    public void perform() throws Exception {
        System.out.println("------表演家开始表演------");
    }

    @Override
    public void sing(int i) {
        System.out.println("唱出第"+i+"首歌曲");
    }
}
