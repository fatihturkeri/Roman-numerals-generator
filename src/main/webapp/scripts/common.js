
function sendNumber() {
    var result = $('#result');
    var number = $('#number').val();

    if (number == '') {
        result.html('');
        alert("This field cannot be blank!");
        return;
    } else if (!isInt(number)) {
        result.html('');
        alert("Please enter integer!");
        return;
    } else if (!(parseInt(number) > 0 && parseInt(number) < 4000)) {
        result.html('');
        alert("You must enter a number between 0 and 4000.!");
        return;
    }

    $.ajax({
        type: 'GET',
        url: '/convertRomanNumber',
        data: 'number=' + number,
        dataType: 'html',
        success: function (response) {
            result.html('');
            result.html(response);
            result.show();
        },
        error: function (response) {
            result.html(response);
        }
    });
}

function isInt(number) {
    return !isNaN(number) &&
            parseInt(Number(number)) == number &&
            !isNaN(parseInt(number, 10));
}

