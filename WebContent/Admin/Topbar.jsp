<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class='page-topbar '>
			<div class='logo-area'>
			</div>
			<div class='quick-area'>
				<div class='pull-left'>
					<ul class="info-menu left-links list-inline list-unstyled">
						<li class="sidebar-toggle-wrap">
							<a href="#" data-toggle="sidebar" class="sidebar_toggle">
								<i class="fa fa-bars"></i>
							</a>
						</li>
						<li class="message-toggle-wrapper">
							<a href="#" data-toggle="dropdown" class="toggle">
								<i class="fa fa-envelope"></i>
								<span class="badge badge-primary">7</span>
							</a>
							<ul class="dropdown-menu messages animated fadeIn">
								<li class="list">
									<ul class="dropdown-menu-list list-unstyled ps-scrollbar">
										<li class="unread status-available">
											<a href="javascript:;">
												<div class="user-img">
													<img src='<%=basePath%><s:property value="#session.user.avatar"/>'  alt="user-image" class="img-circle img-inline">
												</div>
												<div>
													<span class="name">
                                                        <strong>通知名</strong>
                                                        <span class="time small">通知时间</span>
													<span class="profile-status available pull-right"></span>
													</span>
													<span class="desc small">
                                                        通知内容
                                                    </span>
												</div>
											</a>
										</li>
									</ul>
								</li>
								<li class="external">
									<a href="javascript:;">
										<span>查看所有通知</span>
									</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
				<div class='pull-right'>
					<ul class="info-menu right-links list-inline list-unstyled">
						<li class="profile">
							<a href="#" data-toggle="dropdown" class="toggle">
							
								<img src='<%=basePath%><s:property value="#session.user.avatar"/>' alt="user-image" class="img-circle img-inline">
								<span><s:property value="#session.user.nickname"/>&nbsp;<i class="fa fa-angle-down"></i></span>
							</a>
							<ul class="dropdown-menu profile animated fadeIn">
								<li>
									<a href="#help">
										<i class="fa fa-info"></i> 帮助
									</a>
								</li>
								<li>
									<a href="Login.jsp">
										<i class="fa fa-lock"></i> 退出
									</a>
								</li>
							</ul>
						</li>
						<li class="chat-toggle-wrapper">
							<a href="#" data-toggle="chatbar" class="toggle_chat">
								<i class="fa fa-comments"></i>
								<span class="badge badge-warning">9</span>
								<i class="fa fa-times"></i>
							</a>
						</li>
					</ul>
				</div>
			</div>

		</div>


	