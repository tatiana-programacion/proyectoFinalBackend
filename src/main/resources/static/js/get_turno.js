window.addEventListener('load', function () {
    (function(){
      event.preventDefault();
      const url = '/turnos';
      const settings = {
        method: 'GET'
    }

    fetch(url,settings)
    .then(response => response.json())
    .then(data => {
    console.log(data)

       for(turno of data){
       console.log(turno)


           var table = document.getElementById("turnoTable");
           var turnoRow = table.insertRow();
           let tr_id = 'tr_' + turno.id;
           turnoRow.id = tr_id;

           let deleteButton = '<button' +
                              ' id=' + '\"' + 'btn_delete_' + turno.id + '\"' +
                              ' type="button" onclick="deleteBy('+turno.id+')" class="btn btn-danger btn_delete">' +
                              '&times' +
                              '</button>';

           let get_More_Info_Btn = '<button' +
                                   ' id=' + '\"' + 'btn_id_' + turno.id + '\"' +
                                   ' type="button" onclick="findBy('+turno.id+')" class="btn btn-info btn_id">' +
                                    turno.id +
                                    '</button>';


           turnoRow.innerHTML = '<td>' + get_More_Info_Btn + '</td>' +
                                                   '<td class=\"td_odontologo\">' + turno.odontologo.nombre.toUpperCase() + " " + turno.odontologo.apellido.toUpperCase() +'</td>' +
                                                   '<td class=\"td_paciente\">' + turno.paciente.nombre.toUpperCase() + " " + turno.paciente.apellido.toUpperCase() +'</td>' +
                                                   '<td class=\"td_fecha\">' + turno.fechaTurno + '</td>' +
                                                   '<td>' + deleteButton + '</td>';
       };

    })
})

(function(){
  let pathname = window.location.pathname;
  if (pathname == "/turnosList.html") {
      document.querySelector(".nav .nav-item a:last").addClass("active");
  }
})


})