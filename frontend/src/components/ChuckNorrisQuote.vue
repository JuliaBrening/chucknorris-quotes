<template>
  <div class="quote-wrapper">
    <img alt="chuck-norris" src="../assets/chuck-norris.png" class="img" />
    <button @click="loadRandomQuote">Chuck Norris</button>
    <h1 class="quote">"{{ randomQuote }}"</h1>
  </div>
</template>

<script>
export default {
  name: "ChuckNorrisQuote",
  data() {
    return {
      randomQuote: '',
    };
  },
  methods: {
    loadRandomQuote() {
      const index = this.getRandomInt(79)
      fetch("http://localhost:8080/api/v1/quotes?index=" + index)
      .then((response) => response.json())
      .then((json) => (this.randomQuote = json.quote));
    },
    getRandomInt(maxExclusive) {
      return Math.floor(Math.random() * maxExclusive);
    },
  },
};
</script>

<style>
.quote-wrapper {
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  height: 100%;
  width: 95%;
  margin: auto;
}
h1 {
  font-size: 4vw;
  text-align: center;
  font-style: italic;
}
.img {
  width: 50%;
}
.quote {
  width: 50%;
}

@media screen and (max-width: 780px) {
  .quote-wrapper {
    display: flex;
    flex-direction: column;
  }
  .img {
    width: 100%;
  }
  .quote {
    width: 100%;
  }
}
</style>
