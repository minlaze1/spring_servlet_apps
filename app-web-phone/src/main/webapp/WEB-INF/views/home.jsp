<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

 	
	<h1>Welcome ${username} to our online's phones store From SarayaTech</h1>
	

	<a href="/addPhone.do"> <b>Add new phone</b></a>
	<hr>
		
		<table>
			<thead>
					<tr>
						<td  ><b>Image</b></td>
						<td ><b>Year</b></td>
						<td  ><b>Brand</b></td>
						<td ><b>Model</b></td>
						<td ><b>Color</b></td>
						<td><b>Remove Phone</b></td>
					</tr>
			</thead>
			<tbody>
			<c:forEach items="${phones}" var="phone">
				<tr>
					<td  ><img src = "${phone.image}" width="100" height="100" /></td>
					<td  >${phone.year}</td>
					<td  >${phone.make}</td>
					<td  >${phone.model}</td>
					<td  >${phone.color}</td>
					<td><b>&nbsp; &nbsp;
     <a href="/delete.do?id=${phone.id}">Delete</a></b></td>
				</tr>
			</c:forEach>	
			</tbody>
			
			
		</table>
		
<%@ include file="../common/footer.jspf"%>