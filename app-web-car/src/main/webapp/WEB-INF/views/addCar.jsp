
<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

<form action="/addCar.do" method="post">
			<input type="text" name = "yr" placeholder="year" required>
			<input type="text" name = "mk" placeholder="make" required>
			<input type="text" name = "md" placeholder="model" required>
			<input type="text" name = "im" placeholder="image link" required>
			<input type="submit" value="Add a Car">
		</form>
		
<%@ include file="../common/footer.jspf"%>