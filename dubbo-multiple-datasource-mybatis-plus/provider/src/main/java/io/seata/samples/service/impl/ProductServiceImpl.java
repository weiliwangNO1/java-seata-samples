/*
 *  Copyright 1999-2021 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.samples.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import io.seata.samples.service.IProductService;
import org.apache.dubbo.config.annotation.DubboService;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import io.seata.samples.entity.Product;
import io.seata.samples.mapper.ProductMapper;

@DubboService(version = "1.0.0", interfaceClass = IProductService.class)
@DS(value = "master_3")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
