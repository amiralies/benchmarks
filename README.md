<!-- README.md is generated from README.ecr, do not edit -->

# GraphQL server benchmarks

Graphql server benchmarks in many languages. Pull requests welcome, please read [CONTRIBUTING.md](CONTRIBUTING.md)

All servers implement a simple schema:

```graphql
type Query {
  hello: String!
}
```

The returned string is always `world`.

The API is served over HTTP using a common web server and load tested using [bombardier](https://github.com/codesenberg/bombardier).

### Results

| Name                          | Language      | Server          | Latency avg      | Requests      |
| ----------------------------  | ------------- | --------------- | ---------------- | ------------- |
| [static-rust](https://actix.rs/) | Rust | Actix Web | 2.01ms | 50kps |
| [graphql-crystal](https://github.com/graphql-crystal/graphql) | Crystal | Kemal | 5.36ms | 19kps |
| [gqlgen](https://github.com/99designs/gqlgen) | Go | net/http | 6.56ms | 15kps |
| [Juniper](https://github.com/graphql-rust/juniper) | Rust | Actix Web | 7.30ms | 14kps |
| [async-graphql](https://github.com/async-graphql/async-graphql) | Rust | Actix Web | 7.73ms | 13kps |
| [Hot Chocolate](https://github.com/ChilliCream/hotchocolate) | C# | ASP.NET | 12.03ms | 8.3kps |
| [agoo](https://github.com/ohler55/agoo) | Ruby/C | agoo | 12.42ms | 8.1kps |
| [graphql-go](https://github.com/graphql-go/graphql) | Go | net/http | 15.21ms | 6.6kps |
| [Mercurius](https://github.com/mercurius-js/mercurius) | Node.js | Fastify | 17.04ms | 5.9kps |
| [Hono](https://github.com/honojs/graphql-server) | Bun | HonoJS | 19.94ms | 5.0kps |
| [graphql-yoga](https://github.com/dotansimha/graphql-yoga) | Node.js | http | 28.17ms | 3.6kps |
| [Absinthe](https://github.com/absinthe-graphql/absinthe) | Elixir | Phoenix | 33.15ms | 3.0kps |
| [graphql-jit](https://github.com/zalando-incubator/graphql-jit) | Node.js | http | 38.53ms | 2.6kps |
| [graphql-ruby](https://github.com/rmosolgo/graphql-ruby) | Ruby | Puma | 60.00ms | 2.1kps |
| [apollo](https://github.com/apollographql/apollo-server) | Node.js | Express | 52.53ms | 1.9kps |
| [graphql-js](https://github.com/graphql/graphql-js) | Node.js | http | 61.14ms | 1.6kps |
| [Strawberry](https://github.com/strawberry-graphql/strawberry) | Python | gunicorn | 132.78ms | 740ps |
| [Graphene](https://github.com/graphql-python/graphene) | Python | gunicorn | 142.76ms | 690ps |
| [Sangria](https://github.com/sangria-graphql/sangria) | Scala | Akka HTTP | 190.45ms | 520ps |
| [Caliban](https://github.com/ghostdogpr/caliban) | Scala | ZIO HTTP | 822.92ms | 110ps |
