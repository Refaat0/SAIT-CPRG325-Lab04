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
                <table>
                    <tr>
                        <td><label>Title: ${note.noteTitle}</label></td>
                    </tr>
                    <tr>
                        <td><label>Contents: ${note.noteContents}</label></td>
                    </tr>
                </table>
            </div>

            <a href="note?edit">Edit</a>
        </main>
    </body>
</html>
