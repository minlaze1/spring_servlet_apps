<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

 	
	<h1>Welcome ${username} to our online cars store From SarayaTech</h1>
	

	<a href="/addCar.do"> <b>Add new Car</b></a>
	<hr>
		
		<table>
			<thead>
					<tr>
						<td  ><b>Image</b></td>
						<td ><b>Year</b></td>
						<td  ><b>Make</b></td>
						<td ><b>Model</b></td>
						<td><b>Remove Car</b></td>
					</tr>
			</thead>
			<tbody>
			<c:forEach items="${cars}" var="car">
				<tr>
					<td  ><img src = "${car.image}" width="100" height="100" /></td>
					<td  >${car.year}</td>
					<td  >${car.make}</td>
					<td  >${car.model}</td>
					<td><b>&nbsp; &nbsp;
     <a href="/delete.do?id=${car.id}">Delete</a></b></td>
				</tr>
			</c:forEach>	
			</tbody>
			
			
		</table>
		
<%@ include file="../common/footer.jspf"%>