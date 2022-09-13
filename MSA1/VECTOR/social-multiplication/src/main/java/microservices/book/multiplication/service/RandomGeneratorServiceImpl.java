package microservices.book.multiplication.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
class RandomGeneratorServiceImpl implements RandomGeneratorService {
  // 예제 3.3 -> 테스트 실패 (0만 찍어냄)
  /*@Override
  public int generateRandomFactor() {
    return 0;

  }*/

  //예제 3.5
  final static int MINIMUM_FACTOR = 11;
  final static int MAXIMUM_FACTOR = 99;

  @Override
  public int generateRandomFactor() {
    return new Random().nextInt((MAXIMUM_FACTOR - MINIMUM_FACTOR) + 1) + MINIMUM_FACTOR;
  }

}
