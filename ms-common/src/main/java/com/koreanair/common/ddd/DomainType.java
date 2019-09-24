package com.koreanair.common.ddd;

import java.lang.annotation.*;

@Inherited
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({
        ElementType.TYPE, // 타입 선언시
})

public @interface DomainType {
    public enum Domain {Entity, AggregateRoot, ValueObject}
    Domain value() default Domain.Entity;
}