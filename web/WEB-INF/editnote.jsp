<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Notes</title>
    </head>
    <body>
        <header>
            <h1>Simple Note Keeper</h1>
        </header>

        <main>
            <div class="note-container">
                <form action="note" method="POST">
                    <table>
                        <tr>
                            <td><label>Title: </label></td>
                            <td><input type="text" name="noteTitle" value="${note.noteTitle}"></td>
                        </tr>
                        <tr>
                            <td><label>Contents: ${bar}</label></td>
                            <td><input type="text" name="noteContents" value="${note.noteContents}"></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="save"></td>
                        </tr>
                    </table>
                </form>
            </div>

        </main>
    </body>
</html>
