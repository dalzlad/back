import React, { useState, useEffect } from "react";
import axios from "axios";

const GetData = () => {
  // State to store the fetched data
  const [data, setData] = useState([]);
  const [loading, setLoading] = useState(true);

  // Function to fetch data using Axios
  const fetchData = async () => {
    try {
      const response = await axios.get("https://apinodemongo-iox5.onrender.com/api/usuarios");
      setData(response.data.usuarios);
      setLoading(false);
    } catch (error) {
      console.error("Error fetching data:", error);
      setLoading(false);
    }
  };

  // Call fetchData on component mount
  useEffect(() => {
    fetchData();
  }, []);

  return (
    <div>
      <h2>Posts:</h2>
      <ul>
      {data && Array.isArray(data) && data.map(item => (
          <li key={item._id}>{item.nombre}-{item.email}</li>
          
        ))}
      </ul>
    </div>
  );
};

export default GetData;



// ListaDatos.js

/*import React, { useState, useEffect } from 'react';
import axios from 'axios';

const ListaDatos = () => {
  const [data, setData] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get('https://apinodemongo-iox5.onrender.com/api/usuarios');
        setData(response.data);
        setLoading(false);
        console.log(response.data)
      } catch (error) {
        console.error('Error fetching data:', error);
        setLoading(false);
      }
    };

    fetchData();
  }, []); // The empty dependency array ensures the effect runs only once on component mount

  return (
    <div>
      <h2>Data List</h2>
      {loading ? (
        <p>Loading...</p>
      ) : (
        <ul>
          if (Array.isArray(data)) {
            console.log(data)
           // data.map(item => console.log(item))
        } else if (data && Array.isArray(data.items)) {
            //data.items.map(item => console.log(item))
            console.log(data)
        } else {
            console.error("Invalid data structure")
        }
        </ul>
      )}
    </div>
  );
};

export default ListaDatos;

*/