fun findTallerTheTower(senderHeight: Int, receiverHeights: IntArray):IntArray {

    // 오른쪽 값부터 가져와서 senderHeight 값보다 크면 탐색 종료하고
    receiverHeights.takeLastWhile { senderHeight < it }
            .mapIndexed { index, i ->  }


   // return receiverHeights.take(1).toIntArray()
    //{ tower, height -> senderHeight < height }

}