package codility;

public class FrogJmp {
    //O(1)
    //X 위치에서 Y 위치로의 최소 점프 수를 세십시오.
    static int solution(int X, int Y, int D) {

        int count = (Y - X) / D;
        X += count * D;

        while(X < Y) {
            count++;
            X += D;
        }
        return count;
    }

    static int solution2(int X, int Y, int D) {

        if((Y-X) % D != 0)
            return (Y - X) / D + 1;
        else
            return (Y - X) / D;


    }

    public static void main(String[] args) {
        System.out.println(solution(1,3,1));

    }
}
