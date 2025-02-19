package com.example.kakao.domain.cart.dto.request;

import com.example.kakao.domain.cart.service.CartPolicyManager;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Positive;

@Getter
@Setter
@Builder
public class SaveRequestDTO {
  @Positive(message = "옵션 아이디는 1 이상이어야 합니다.")
  private int optionId;
  @Positive(message = "수량은 1 이상이어야 합니다.")
  @Max(value = CartPolicyManager.MAX_QUANTITY, message = "수량은 " + CartPolicyManager.MAX_QUANTITY + "개 이하이어야 합니다.")
  private int quantity;
}