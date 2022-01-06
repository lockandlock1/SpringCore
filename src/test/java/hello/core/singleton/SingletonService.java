package hello.core.singleton;

public class SingletonService {

    // 이걸 모른다면 자바의 스태틱 영역에 대한 복기 필요
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
