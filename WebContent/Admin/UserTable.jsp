<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div class="col-lg-12">
	<section class="box ">
		<header class="panel_header">
			<h2 class="title pull-left">所有用户</h2>
			<div class="actions panel_actions pull-right">
				<i class="box_toggle fa fa-chevron-down"></i> <i
					class="box_setting fa fa-cog" data-toggle="modal"
					href="#section-settings"></i> <i class="box_close fa fa-times"></i>
			</div>
		</header>
		<div class="content-body">
			<div class="row">
				<div class="col-md-12 col-sm-12 col-xs-12">
					<table id="example-1"
						class="table table-striped dt-responsive display" cellspacing="0"
						width="100%">

						<thead>
							<tr>
								<th>手机</th>
								<th>昵称</th>
								<th>年龄</th>
								<th>邮箱</th>
								<th>身份证</th>
								<th>认证状态</th>
								<th>审核</th>
							</tr>
						</thead>

						<tbody>

							<s:iterator value="showList">
								<tr>
									<td><s:property value="phone" />
									</td>
									<td><s:property value="nickName" />
									</td>
									<td><s:property value="age" />
									</td>
									<td><s:property value="mailbox" />
									</td>
									<td><s:property value="identityNumber" />
									</td>
									<td><s:property value="balance" />
									</td>
								</tr>
							</s:iterator>

						</tbody>


					</table>
				</div>
			</div>
		</div>
	</section>
</div>

