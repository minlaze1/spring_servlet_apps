<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

 	
	<h1>Welcome ${username} to our online's planes store From SarayaTech</h1>
	

	<a href="/addPlane.do"> <b>Add new plane</b></a>
	<hr>
		
		<table>
			<thead>
					<tr>
						<td  ><b>Image</b></td>
						<td ><b>Year</b></td>
						<td  ><b>Make</b></td>
						<td ><b>Model</b></td>
						<td ><b>Length</b></td>
						<td><b>Remove Plane</b></td>
					</tr>
			</thead>
			<tbody>
			<c:forEach items="${planes}" var="plane">
				<tr>
					<td  ><img src = "${plane.image}" width="100" height="100" /></td>
					<td  >${plane.year}</td>
					<td  >${plane.make}</td>
					<td  >${plane.model}</td>
					<td  >${plane.length}</td>
					<td><b>&nbsp; &nbsp;
     <a href="/delete.do?id=${plane.id}">Delete</a></b></td>
				</tr>
			</c:forEach>	
			</tbody>
			
			
		</table>
		
<%@ include file="../common/footer.jspf"%>