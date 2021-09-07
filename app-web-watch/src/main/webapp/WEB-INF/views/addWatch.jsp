
<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

<form action="/addWatch.do" method="post">
			<input type="text" name = "yr" placeholder="year" required>
			<input type="text" name = "bd" placeholder="brand" required>
			<input type="text" name = "md" placeholder="model" required>
			<input type="text" name = "im" placeholder="image link" required>
			<input type="submit" value="Add a Watch">
		</form>
		
<%@ include file="../common/footer.jspf"%>