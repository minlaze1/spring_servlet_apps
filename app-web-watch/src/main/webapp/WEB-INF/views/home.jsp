<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

 	
	<h1>Welcome ${username} to our online's Watches store From SarayaTech</h1>
	

	<a href="/addWatch.do"> <b>Add new Watch</b></a>
	<hr>
		
		<table>
			<thead>
					<tr>
						<td  ><b>Image</b></td>
						<td ><b>Year</b></td>
						<td  ><b>Brand</b></td>
						<td ><b>Model</b></td>
						<td><b>Remove Watch</b></td>
					</tr>
			</thead>
			<tbody>
			<c:forEach items="${watches}" var="watch">
				<tr>
					<td  ><img src = "${watch.image}" width="100" height="100" /></td>
					<td  >${watch.year}</td>
					<td  >${watch.brand}</td>
					<td  >${watch.model}</td>
					<td><b>&nbsp; &nbsp;
     <a href="/delete.do?id=${watch.id}">Delete</a></b></td>
				</tr>
			</c:forEach>	
			</tbody>
			
			
		</table>
		
<%@ include file="../common/footer.jspf"%>