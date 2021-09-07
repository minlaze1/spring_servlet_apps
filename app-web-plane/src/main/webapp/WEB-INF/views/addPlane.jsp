
<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

<form action="/addPlane.do" method="post">
			<input type="text" name = "yr" placeholder="year" required><br>
			<input type="text" name = "mk" placeholder="make" required><br>
			<input type="text" name = "md" placeholder="model" required><br>
			<input type="text" name = "ln" placeholder="length" required><br>
			<input type="text" name = "im" placeholder="image link" required><br>
			<input type="submit" value="Add a Plane">
		</form>
		
<%@ include file="../common/footer.jspf"%>