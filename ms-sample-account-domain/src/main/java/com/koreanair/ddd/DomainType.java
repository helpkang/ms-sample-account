package com.koreanair.ddd;

import java.lang.annotation.*;

@Inherited
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({
        ElementType.TYPE, // 타입 선언시
})

public @interface DomainType {
    public enum Quality {Entity, AggregateRoot, ValueObject}
    Quality value() default Quality.Entity;
}