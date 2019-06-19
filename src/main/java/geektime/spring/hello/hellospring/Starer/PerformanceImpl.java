package geektime.spring.hello.hellospring.Starer;

import geektime.spring.hello.hellospring.Audien.Animal;
import org.springframework.stereotype.Component;

@Component("performanceI")
public class PerformanceImpl implements Performance {
    @Override
    public void perform() throws Exception {
        System.out.println("------表演家开始表演------");
    }


    @Override
    public void sing(int i) {
        System.out.println("唱出第"+i+"首歌曲");
    }
}
