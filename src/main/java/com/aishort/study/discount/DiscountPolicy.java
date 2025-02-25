package com.aishort.study.discount;

import com.aishort.study.member.Member;

public interface DiscountPolicy {

    /*
     * @return 할인 대상 금액
     * */
    int discount(Member member, int price);
}

