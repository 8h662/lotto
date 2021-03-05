import java.util.*

fun main() {
    println("로또 번호 생성기 1 부터 5 사이의 숫자를 입력하세요.")
    val input = Scanner(System.`in`).nextInt()
    if (input in 1..5) {
        createLotto(input)
    } else {
        println("잘못입력하였습니다.")
    }
}

// 번호를 생성하는 함수
fun createLotto(input: Int) {
    // 1~45까지를 순서대로 담을 변수
    var lottoList = mutableListOf<Int>();
    // 최종 당첨 번호를 담을 변수
    var choiceList = mutableListOf<Int>();
    // lottoList의 길이를 담을 변수, 1씩 줄여서 사용할 예정
    var listLen = 45;

    for (i in 1..45) {
        // 반복문으로 1부터 45까지 순서대로 변수
        lottoList.add(i)
    }

    for (i in 0..(input-1)) {
        // 랜덤으로 추출할 인덱스를 선출한다음
        var choiceIndex = Random().nextInt(listLen - i)
        // 최종 선택 리스트에 추가합니다
        choiceList.add(lottoList[choiceIndex])
        // lottoList에서 선출된 번호를 제거
        lottoList.removeAt(choiceIndex)
    }
                                                           
    println(choiceList)
}