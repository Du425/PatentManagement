package com.du.patentmanagement.service.impl;

import com.du.patentmanagement.entity.Admin;
import com.du.patentmanagement.mapper.AdminMapper;
import com.du.patentmanagement.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Du425
 * @since 2021-12-26
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
