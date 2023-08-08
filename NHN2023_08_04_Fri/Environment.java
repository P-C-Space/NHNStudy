package NHN2023_08_04_Fri;

public class Environment {
    public static void main(String[] args) {
                    // 코드와 코드해석의 쌍이 (closure)
                    // closure를 가지고 계속해서 줄여나가는 것을 (reduction) (evaluation)
                    // 무언가를 해석할 수 있는 문맥을 Environment or context라고 한다.
        int x = 4; // {(x, 4)}
        int y = 5; // {(x, 4), (y, 5)} = r
        y = y + x; // {y + x}{코드를 해석할 수 있는 Environment가 따라다님(x,4),(y,5)} 
                    //  => {y + x}r
                    // {5 + x}r
                    // {5 + 4}r
                    // 9r => {y = 9}r
                    // 이 때 Enviroment의 변화(Statement) => r' = {(x,4),(y,5)} 
                    // 이떄 변화를 기록하기 위해(r') 시간을 기록하며 순서가 생긴다.
        {
            int z = 3; // {(z,3)} + r' 새로운 z의 추가
            int y = 4; // {(z,3),(y,4)} + r' 집합을 나눔
            // Frame -> 매 블록마다 Frame이 생김
            // Frame들의 나무 -> Environment -> binding의 집합
            y = x; // {(z,3),(y,4)}에 존재하지 않음 상위나무로 -> r' => {(x,4),(y,5)}
            // 다시 기존의 트리에 영향을 주기 때문에 시간에 영향을 받아 r'' = {(z+3),(y+4)} + r'으로 저장
        }
    }
}
