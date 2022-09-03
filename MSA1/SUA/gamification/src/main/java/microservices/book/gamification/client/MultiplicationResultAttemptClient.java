package microservices.book.gamification.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import microservices.book.gamification.client.dto.MultiplicationResultAttempt;

/**
 * Multiplication 마이크로서비스와 연결하는 인터페이스
 * 통신 방식은 상관 없음
 */
public interface MultiplicationResultAttemptClient {

    @HystrixCommand(fallbackMethod = "defaultResult")
    MultiplicationResultAttempt retrieveMultiplicationResultAttemptbyId(Long multiplicationResultAttemptId);

    MultiplicationResultAttempt retrieveMultiplicationResultAttemptById(final Long multiplicationId);

}