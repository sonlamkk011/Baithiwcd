<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/client/include/heade.jsp"/>
<jsp:include page="/client/include/navbar.jsp"/>
<jsp:include page="/client/include/silebar.jsp"/>

<html>
<head>
    <title>Title</title>
</head>
<body>
<section class="section" style="margin-left: 400px; margin-top: 100px">
    <div class="row">
        <div class="card">
            <div class="card-body">
                <div class="col-lg-8">
                    <div class="col-md-4">
                        <label style="margin-top: 30px" class="form-label">Brand</label>
                        <select class="form-select" style="width: 150px">
                            <option selected>Iphone</option>
                            <option selected>Sam Sung</option>
                            <option selected>Nokia</option>
                            <option selected>Oppo</option>
                        </select>
                    </div>
                    <form action="/phone/create" method="post">
                        <div class="col-md-6">
                            <label class="col-md-6 col-form-label">Name</label>
                            <div class="col-sm-12" style="width: 180px">
                                <input type="text" class="form-control"
                                <%--                                <% if (errors.containsKey(Validate.FOOD_ERROR_KEY_NAME)) { %>--%>
                                <%--                                <div class="invalid-feedback">--%>
                                <%--                                    <%= errors.get(Validate.FOOD_ERROR_KEY_NAME) %>--%>
                                <%--                                </div>--%>
                                <%--                                <% } %>--%>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label class="form-label">Price</label>
                            <input type="number" class="form-control"
                            <%--                            <% if (errors.containsKey(Validate.FOOD_ERROR_KEY_PRICE)) { %>--%>
                            <%--                            <div class="invalid-feedback">--%>
                            <%--                                <%= errors.get(Validate.FOOD_ERROR_KEY_PRICE) %>--%>
                            <%--                            </div>--%>
                            <%--                            <% } %>--%>
                            >
                        </div>
                        <div class="col-md-6">
                            <label class="col-md-6 col-form-label">Description</label>
                            <textarea class="form-control" style="height: 100px"
                            <%--                            <% if (errors.containsKey(Validate.FOOD_ERROR_KEY_DESCRIPTION)) { %>--%>
                            <%--                            <div class="invalid-feedback">--%>
                            <%--                                <%= errors.get(Validate.FOOD_ERROR_KEY_DESCRIPTION) %>--%>
                            <%--                            </div>--%>
                            <%--                            <% } %>--%>
                            ></textarea>
                        </div>
                        <div class="row mb-3" style="margin-top: 30px">
                            <div class="col-sm-10">
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<jsp:include page="/client/include/footer.jsp"/>
<jsp:include page="/client/include/scrip.jsp"/>
</body>
</html>
