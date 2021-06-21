package com.tionkior.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName : MyImportSelector
 * @Author : TionKior
 * @Date : 2021/6/21 9:07
 * @Version : V1.0
 * @Description :
 */

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.tionkior.domain.User", "com.tionkior.domain.Role"};
    }
}

