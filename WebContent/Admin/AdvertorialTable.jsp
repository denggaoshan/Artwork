<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>




<div class="col-lg-12">
	<section class="box ">
		<header class="panel_header">
			<h2 class="title pull-left">所有软文</h2>
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
								<th>标题</th>
								<th>摘要</th>
								<th>正文</th>
								<th>位置</th>
								<th>开始时间</th>
								<th>结束时间</th>
								<th>审核状态</th>
								<th>审核</th>
							</tr>
						</thead>

						<tbody>
							<s:iterator value="showList">
								<tr>
									<td><s:property value="title" /></td>
									<td><s:property value="topic" /></td>
									<td><s:property value="content" /></td>
									<td><s:property value="position" /></td>
									<td><s:property value="beginTime" /></td>
									<td><s:property value="endTime" /></td>
									<td><s:property value="verifyStatus" /></td>
								</tr>
							</s:iterator>
						</tbody>

					</table>

				</div>
			</div>
		</div>
	</section>
</div>

